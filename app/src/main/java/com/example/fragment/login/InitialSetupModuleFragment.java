package com.example.fragment.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class InitialSetupModuleFragment extends Fragment{
    public static View initialsetupview;
    private ImageButton addbtn;
    private static FragmentManager loginfragmentManager;
    public InitialSetupModuleFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Initial setup "," called");
        initialsetupview = inflater.inflate(R.layout.initialsetupmodulefragment, container, false);
        loginfragmentManager = getActivity().getSupportFragmentManager();
        addbtn = (ImageButton) getView().findViewById(R.id.moreImageButton);
        Log.d("addbtn ", addbtn.toString());

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Log.d("Ssdsad ", " asass");
            }
        });
      return  initialsetupview;
    }
}
