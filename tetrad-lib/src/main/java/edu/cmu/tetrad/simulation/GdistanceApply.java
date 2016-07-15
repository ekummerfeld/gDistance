package edu.cmu.tetrad.simulation;

import edu.cmu.tetrad.graph.Graph;
import edu.cmu.tetrad.graph.GraphUtils;

import java.io.File;
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
        System.out.println("Running Gdistance");
        List<Double> distance = Gdistance.distances(graph1,graph2,"erich_coordinates.txt",',');
        System.out.println(distance);
        System.out.println("Done running Distance. Elapsed time: " + (System.nanoTime() - timegraph2)/1000000000 + "s");
        System.out.println("Total elapsed time: " + (System.nanoTime() - timestart)/1000000000 + "s");
    }
}
