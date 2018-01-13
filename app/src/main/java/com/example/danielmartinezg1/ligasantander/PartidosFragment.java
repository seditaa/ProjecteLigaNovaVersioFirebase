package com.example.danielmartinezg1.ligasantander;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class PartidosFragment extends Fragment {

    private List<ItemClasificacion> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_partidos, container, false);
        getActivity().setTitle("Partidos");
        super.onCreate(savedInstanceState);

        ListView lv = (ListView) view.findViewById(R.id.match_list);

        //ArrayList<ItemClasificacion> itemsPartido = obtenerItems();
        ItemClass  = new ArrayList<ItemClasificacion>();
        ItemClass = obtenerItems();
        ItemClasificacionAdapter adapter = new ItemClasificacionAdapter(getActivity(), ItemClass) {
        };

        lv.setAdapter(adapter);

        mDatabase = FirebaseDatabase.getInstance().getReference("Jornadas");
        List<JornadasList> jlist0 = new ArrayList<JornadasList>();

        List<Partidos> plist0 = new ArrayList<Partidos>();
        plist0.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist0.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist0.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist0.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist0.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist1 = new ArrayList<Partidos>();
        plist1.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist1.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist1.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist1.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist1.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist1.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist1.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist2 = new ArrayList<Partidos>();
        plist2.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist2.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist2.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist2.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist2.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist2.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist2.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist2.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist2.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist2.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist3 = new ArrayList<Partidos>();
        plist3.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist3.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist3.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist3.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist3.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist3.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist3.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist3.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist3.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist3.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist4 = new ArrayList<Partidos>();
        plist4.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist4.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist4.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist4.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist4.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist4.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist4.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist4.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist4.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist4.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist5 = new ArrayList<Partidos>();
        plist5.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist5.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist5.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist5.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist5.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist5.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist5.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist5.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist5.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist5.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist6 = new ArrayList<Partidos>();
        plist6.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist6.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist6.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist6.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist6.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist6.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist6.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist6.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist6.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist6.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist7 = new ArrayList<Partidos>();
        plist7.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist7.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist7.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist7.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist7.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist7.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist7.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist7.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist7.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist7.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist8 = new ArrayList<Partidos>();
        plist8.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist8.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist8.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist8.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist8.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist8.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist8.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist8.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist8.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist8.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist9 = new ArrayList<Partidos>();
        plist9.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist9.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist9.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist9.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist9.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist9.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist9.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist9.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist9.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist9.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist10 = new ArrayList<Partidos>();
        plist10.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist10.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist10.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist10.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist10.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist10.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist10.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist10.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist10.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist10.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist11 = new ArrayList<Partidos>();
        plist11.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist11.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist11.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist11.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist11.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist11.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist11.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist11.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist11.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist11.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist12 = new ArrayList<Partidos>();
        plist12.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist12.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist12.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist12.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist12.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist12.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist12.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist12.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist12.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist12.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist13 = new ArrayList<Partidos>();
        plist13.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist13.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist13.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist13.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist13.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist13.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist13.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist13.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist13.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist13.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist14 = new ArrayList<Partidos>();
        plist14.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist14.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist14.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist14.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist14.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist14.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist14.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist14.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist14.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist14.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist15 = new ArrayList<Partidos>();
        plist15.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist15.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist15.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist15.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist15.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist15.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist15.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist15.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist15.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist15.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist16 = new ArrayList<Partidos>();
        plist16.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist16.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist16.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist16.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist16.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist16.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist16.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist16.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist16.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist16.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist17 = new ArrayList<Partidos>();
        plist17.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist17.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist17.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist17.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist17.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist17.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist17.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist17.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist17.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist17.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist18 = new ArrayList<Partidos>();
        plist18.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist18.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist18.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist18.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist18.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist18.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist18.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist18.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist18.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist18.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist19 = new ArrayList<Partidos>();
        plist19.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist19.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist19.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist19.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist19.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist19.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist19.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist19.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist19.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist19.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist20 = new ArrayList<Partidos>();
        plist20.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist20.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist20.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist20.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist20.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist20.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist20.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist20.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist20.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist20.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist21 = new ArrayList<Partidos>();
        plist21.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist21.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist21.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist21.add(new Partidos("Girona","Atlético","1","0","19/08/2017","FIN"));
        plist21.add(new Partidos("Sevilla","Espanyol","1","0","19/08/2017","FIN"));
        plist21.add(new Partidos("Ath. Club","Getafe","1","0","20/08/2017","FIN"));
        plist21.add(new Partidos("Barcelona","Betis","1","0","20/08/2017","FIN"));
        plist21.add(new Partidos("Deportivo","Madrid","1","0","20/08/2017","FIN"));
        plist21.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist21.add(new Partidos("Málaga","Eibar","1","0","21/08/2017","FIN"));


        List<Partidos> plist22 = new ArrayList<Partidos>();
        plist22.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist22.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist22.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist22.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist22.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist22.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist22.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist22.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist22.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist22.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist23 = new ArrayList<Partidos>();
        plist23.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist23.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist23.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist23.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist23.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist23.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist23.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist23.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist23.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist23.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        jlist0.add(new JornadasList("Jornada1",plist1));
        jlist0.add(new JornadasList("Jornada2",plist2));
        jlist0.add(new JornadasList("Jornada1",plist3));
        jlist0.add(new JornadasList("Jornada2",plist4));
        jlist0.add(new JornadasList("Jornada1",plist5));
        jlist0.add(new JornadasList("Jornada2",plist6));
        jlist0.add(new JornadasList("Jornada1",plist7));
        jlist0.add(new JornadasList("Jornada2",plist8));
        jlist0.add(new JornadasList("Jornada1",plist9));
        jlist0.add(new JornadasList("Jornada2",plist10));
        jlist0.add(new JornadasList("Jornada1",plist11));
        jlist0.add(new JornadasList("Jornada2",plist12));
        jlist0.add(new JornadasList("Jornada1",plist13));
        jlist0.add(new JornadasList("Jornada2",plist14));
        jlist0.add(new JornadasList("Jornada1",plist15));
        jlist0.add(new JornadasList("Jornada2",plist16));
        jlist0.add(new JornadasList("Jornada1",plist17));
        jlist0.add(new JornadasList("Jornada2",plist18));
        jlist0.add(new JornadasList("Jornada1",plist19));
        jlist0.add(new JornadasList("Jornada2",plist20));
        jlist0.add(new JornadasList("Jornada1",plist21));
        jlist0.add(new JornadasList("Jornada2",plist22));
        jlist0.add(new JornadasList("Jornada1",plist23));


        mDatabase.setValue(new Jornadas(jlist0));




//                mDatabase = FirebaseDatabase.getInstance().getReference("provaJugador");
  //              List<Jugador> lj = new ArrayList<Jugador>();
    //            lj.add(new Jugador("Mesi",10,20));
      //          mDatabase.setValue(new Equipo("b",34,78,lj));

        /*
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        txt_prueba = (TextView) findViewById(R.id.txt_prueba);
                        txt_prueba2 = (TextView) findViewById(R.id.txt_prueba2);
                        txt_prueba3 = (TextView) findViewById(R.id.txt_prueba3);

                        Equipo e = dataSnapshot.getValue(Equipo.class);
                        txt_prueba3.setText(e.getNom());
                        txt_prueba2.setText(e.getJugadorList().get(0).getNom());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                childEventListener = new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child added");
                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child changed");
                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {
                        Log.i("Dani","child removed");
                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child moved");
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.e("Error","Error",databaseError.toException());
                    }
                };
                eventListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        txt_prueba = (TextView) findViewById(R.id.txt_prueba);
                        txt_prueba2 = (TextView) findViewById(R.id.txt_prueba2);
                        txt_prueba3 = (TextView) findViewById(R.id.txt_prueba3);
                        //txt_prueba.setText(dataSnapshot.child("dia1").getValue().toString());
                        //txt_prueba2.setText(dataSnapshot.child("dia2").getValue().toString());
                        //txt_prueba3.setText(dataSnapshot.child("dia3").getValue().toString());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                };
                //mDatabase.addChildEventListener(childEventListener);
                //mDatabase.addValueEventListener(eventListener);
*/

        return view;
    }


    private ArrayList<ItemClasificacion> obtenerItems() {
        Log.i("Dani","he llegado");

        ArrayList<ItemClasificacion> items = new ArrayList<ItemClasificacion>();

        items.add(new ItemClasificacion("barça", "aldn", "10", "5", "Patatas"));

        items.add(new ItemClasificacion("madri", "Naranja", "1",
                "1", "hoy"));

        return items;
    }

}



