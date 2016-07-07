package edu.cmu.tetrad.simulation;

import edu.cmu.tetrad.data.ContinuousVariable;
import edu.cmu.tetrad.graph.Graph;
import edu.cmu.tetrad.graph.GraphUtils;
import edu.cmu.tetrad.graph.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erich on 7/6/2016.
 */
public class GdistanceTest {
    public static void main (String... args) {
        //first generate a couple random graphs
        int numVars = 5;
        int numEdges = 4;
        List<Node> vars = new ArrayList<>();
        for (int i = 0; i < numVars; i++) {
            vars.add(new ContinuousVariable("X" + i));
        }
        Graph testdag1 = GraphUtils.randomGraphRandomForwardEdges(vars, 0, numEdges, 30, 15, 15, false, true);
        Graph testdag2 = GraphUtils.randomGraphRandomForwardEdges(vars, 0, numEdges, 30, 15, 15, false, true);

        //System.out.println(testdag1);

        //then compare their distance
        List<Double> output = Gdistance.distances(testdag1, testdag2, "locationMap.txt",',');

        System.out.println(output);
    }
}
