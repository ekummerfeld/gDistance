package edu.cmu.tetrad.simulation;

import edu.cmu.tetrad.data.DataSet;
import edu.cmu.tetrad.graph.Graph;
import edu.cmu.tetrad.graph.GraphUtils;
import edu.cmu.tetrad.io.TabularContinuousDataReader;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Erich on 7/14/2016.
 */
public class GdistanceApply {
    public static void main (String... args) {
        long timestart = System.nanoTime();
        System.out.println("Loading first graph");
        Graph graph1 = GraphUtils.loadGraphTxt(new File("images_graph_10sub_pd40_group1.txt"));
        long timegraph1 = System.nanoTime();
        //System.out.println(graph1);
        System.out.println("Done loading first graph. Elapsed time: " + (timegraph1 - timestart)/1000000000 + "s");
        System.out.println("Loading second graph");
        Graph graph2 = GraphUtils.loadGraphTxt(new File("images_graph_10sub_pd40_group2.txt"));
        long timegraph2 = System.nanoTime();
        System.out.println("Done loading second graph. Elapsed time: " + (timegraph2 - timegraph1)/1000000000 + "s");

        //load the location map
        String workingDirectory = System.getProperty("user.dir");
        System.out.println(workingDirectory);
        Path mapPath = Paths.get("erich_coordinates.txt");
        System.out.println(mapPath);
        edu.cmu.tetrad.io.DataReader dataReaderMap = new TabularContinuousDataReader(mapPath, ',');
        try{
            DataSet locationMap = dataReaderMap.readInData();
            long timegraph3 = System.nanoTime();
            System.out.println("Done loading location map. Elapsed time: " + (timegraph3 - timegraph2)/1000000000 + "s");

            System.out.println("Running Gdistance");
            //Make this either Gdistance or GdistanceVic
            double xdist = 2.4;
            double ydist = 2.4;
            double zdist = 2;
            //using Gdistance5P now, for non cube voxels and parallel code
            Gdistance5P gdist = new Gdistance5P(locationMap,xdist,ydist,zdist);
            List<Double> distance = gdist.distances(graph1,graph2);
            System.out.println(distance);
            System.out.println("Done running Distance. Elapsed time: " + (System.nanoTime() - timegraph3)/1000000000 + "s");
            System.out.println("Total elapsed time: " + (System.nanoTime() - timestart)/1000000000 + "s");

            PrintWriter writer = new PrintWriter("Gdistances.txt", "UTF-8");
            writer.println(distance);
            writer.close();
        }
        catch(Exception IOException){
            IOException.printStackTrace();
        }
    }
}
