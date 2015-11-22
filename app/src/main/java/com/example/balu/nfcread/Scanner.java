package com.example.balu.nfcread;

/**
 * Created by balu on 21-11-2015.
 */

import android.content.Intent;

import java.util.ArrayList;

public interface Scanner {

    public ArrayList<String> getContents();
    public String ScannerType();
    public boolean scanFilter();

}


