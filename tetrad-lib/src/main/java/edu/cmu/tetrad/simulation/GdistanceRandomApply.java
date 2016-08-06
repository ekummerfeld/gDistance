package edu.cmu.tetrad.simulation;

import edu.cmu.tetrad.data.DataSet;
import edu.cmu.tetrad.io.TabularContinuousDataReader;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Erich on 8/6/2016.
 */
public class GdistanceRandomApply {
    public static void main (String... args) {
        //load the location map
        String workingDirectory = System.getProperty("user.dir");
        System.out.println(workingDirectory);
        Path mapPath = Paths.get("erich_coordinates.txt");
        System.out.println(mapPath);
        edu.cmu.tetrad.io.DataReader dataReaderMap = new TabularContinuousDataReader(mapPath, ',');
        try{
            DataSet locationMap = dataReaderMap.readInData();
            System.out.println("locationMap loaded");

            GdistanceRandom simRandGdistances = new GdistanceRandom(locationMap);
            System.out.println("GdistanceRandom constructed");

            simRandGdistances.setNumEdges1(10);
            simRandGdistances.setNumEdges2(10);
            simRandGdistances.setVerbose(true);

            System.out.println("Edge parameters set, starting simulations");
            simRandGdistances.randomSimulation(2);
        }
        catch(Exception IOException){
            IOException.printStackTrace();
        }
    }
}
