package edu.cmu.tetrad.simulation;

import edu.cmu.tetrad.data.DataSet;
import edu.cmu.tetrad.graph.Graph;
import edu.cmu.tetrad.graph.GraphUtils;
import edu.cmu.tetrad.search.DagToPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erich on 8/6/2016.
 */
public class GdistanceRandom {
    private static DataSet locationMap;
    private int numEdges1;
    private int numEdges2;

    //**************CONSTRUCTORS*********************//
    public GdistanceRandom(DataSet inMap) {
        setLocationMap(inMap);
    }

    private List<Double> randomPairSimulation(){
        //make 2 random dags over the vars in locationMap
        int numVars=locationMap.getNumColumns();
        Graph dag1 = GraphUtils.randomGraphRandomForwardEdges(locationMap.getVariables(),0, numEdges1, numVars,numVars,numVars, false, false);
        Graph dag2 = GraphUtils.randomGraphRandomForwardEdges(locationMap.getVariables(),0, numEdges2, numVars,numVars,numVars, false, false);

        //convert those dags to patterns
        DagToPattern converter1 = new DagToPattern(dag1);
        Graph graph1 = converter1.convert();
        DagToPattern converter2 = new DagToPattern(dag2);
        Graph graph2 = converter2.convert();

        //run Gdistance on these two graphs
        return Gdistance.distances(graph1, graph2, locationMap);
    }

    public List<List<Double>> randomSimulation(int repeat){
        List<List<Double>> simdata = new ArrayList<>();
        for (int counter =0; counter < repeat; counter++) {
            List<Double> distance = randomPairSimulation();
            simdata.add(distance);
        }
        return simdata;
    }

    //**********Methods for setting values of private variables**************//
    public void setLocationMap(DataSet map){
        locationMap=map;
    }

    public void setNumEdges1(int edges){
        numEdges1=edges;
    }

    public void setNumEdges2(int edges){
        numEdges2=edges;
    }
}
