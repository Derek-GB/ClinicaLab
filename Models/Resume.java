/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author d2tod
 */
public class Resume {
    private String medicalObservations;
    private String heartRate;
    private String temparature;
    private String weight;
    private String height;
    private ArrayList<String> medictions;
    private ArrayList<String> tests;

    public String getMedicalObservations() {
        return medicalObservations;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getTemparature() {
        return temparature;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public Iterator<String> getMedictions() {
        return medictions.iterator();
    }

    public Iterator<String> getTests() {
        return tests.iterator();
    }

    public Resume(String medicalObservations, String heartRate, String temparature, String weight, String height, ArrayList<String> medictions, ArrayList<String> tests) {
        this.medicalObservations = medicalObservations;
        this.heartRate = heartRate;
        this.temparature = temparature;
        this.weight = weight;
        this.height = height;
        this.medictions = medictions;
        this.tests = tests;
    }
    
}
