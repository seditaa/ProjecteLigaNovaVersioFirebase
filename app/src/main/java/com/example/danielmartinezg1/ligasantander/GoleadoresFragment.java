package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.FirebaseDatabase;

public class GoleadoresFragment extends Fragment {

    //private View mRootView;
    //public ListView mListView;
    //private FirebaseListAdapter <String> mListAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_goleadores, container, false);
        getActivity().setTitle("Goleadores y asistentes");
        //initialiseView();


        return view;
    }
/*
    private void initialiseView() {
        mListView = (ListView)mRootView.findViewById(R.id.)
    }
*/

}
