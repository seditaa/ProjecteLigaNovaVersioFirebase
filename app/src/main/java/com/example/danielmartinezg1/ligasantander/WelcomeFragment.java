package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

//¡¡¡¡¡¡¡¡¡¡¡¡FRAGMENT DE ADMINISTRADOR!!!!!!!!!!!!!! --> PERMET ACTUALITZAR LES DADES DEL SERVIDOR
public class WelcomeFragment extends Fragment {
public DatabaseReference mDatabase;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflem el layout del fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        getActivity().setTitle(R.string.Welcome);

        //Métodes que permeten la actualització de la base de dades a Firebase
        actualizaJornadasPartidos();
        actualizaEquipo();
        actualizaPichichi();

        return view;
    }

    //Actualitza els golejadors: Creem una llista dels jugadors més importants omplint tots els camps
    //requerits a la classe Pichichis_list creada i la pujem al Firebase
    private void actualizaPichichi() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Pichichis");

        List<Jugador> pichichi_list = new ArrayList<Jugador>();

        pichichi_list.add(new Jugador("Messi","17","7"));
        pichichi_list.add(new Jugador("L.Suárez","13","1"));
        pichichi_list.add(new Jugador("Yago Aspas","11","2"));
        pichichi_list.add(new Jugador("Zaza","10","2"));
        pichichi_list.add(new Jugador("Bakambú","9","2"));
        pichichi_list.add(new Jugador("Stuani","9","6"));
        pichichi_list.add(new Jugador("Maxi Gomez","9","2"));
        pichichi_list.add(new Jugador("Rodrigo","9","1"));
        pichichi_list.add(new Jugador("Paulinho","8","0"));
        pichichi_list.add(new Jugador("G.Moreno","8","0"));
        pichichi_list.add(new Jugador("Willian José","8","1"));
        pichichi_list.add(new Jugador("Aduriz","7","5"));
        pichichi_list.add(new Jugador("Sanabria","7","1"));

        mDatabase.setValue(new Pichichis_list(pichichi_list));
    }

    //Actualitza els equips: Creem una llista dels equips pertanyents a la lliga omplint tots els camps
    //requerits a la classe Equipo creada. Com aquesta classe inclou una llista de jugadors també la
    // hem d'omplir amb els camps requerits a la classe Jugador, i pujem tot al Firebase
    private void actualizaEquipo() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Equipos");

        List<Jugador> jugadorlist = new ArrayList<Jugador>();

        jugadorlist.add(new Jugador("Messi","17","7"));
        jugadorlist.add(new Jugador("L.Suárez","11","1"));
        jugadorlist.add(new Jugador("Paulinho","7","2"));
        jugadorlist.add(new Jugador("P.Alcácer","2","2"));
        jugadorlist.add(new Jugador("D.Suárez","2","2"));
        jugadorlist.add(new Jugador("J.Alba","1","6"));
        jugadorlist.add(new Jugador("Busquets","1","2"));
        jugadorlist.add(new Jugador("Deulofeu","1","1"));
        jugadorlist.add(new Jugador("Iniesta","1","0"));
        jugadorlist.add(new Jugador("Piqué","1","0"));


        List<Jugador> jugadorlist1 = new ArrayList<Jugador>();

        jugadorlist1.add(new Jugador("Correa","5","1"));
        jugadorlist1.add(new Jugador("Griezmann","5","5"));
        jugadorlist1.add(new Jugador("Gameiro","4","1"));
        jugadorlist1.add(new Jugador("Carrasco","3","3"));
        jugadorlist1.add(new Jugador("Koke","2","2"));
        jugadorlist1.add(new Jugador("Saúl","2","2"));
        jugadorlist1.add(new Jugador("Thomas","2","0"));
        jugadorlist1.add(new Jugador("D.Costa","1","0"));
        jugadorlist1.add(new Jugador("Giménez","1","0"));
        jugadorlist1.add(new Jugador("Filipe Luis","1","1"));

        List<Jugador> jugadorlist2 = new ArrayList<Jugador>();

        jugadorlist2.add(new Jugador("Zaza","10","0"));
        jugadorlist2.add(new Jugador("Rodrigo","9","4"));
        jugadorlist2.add(new Jugador("S.Mina","6","1"));
        jugadorlist2.add(new Jugador("Guedes","4","6"));
        jugadorlist2.add(new Jugador("Parejo","4","3"));
        jugadorlist2.add(new Jugador("Kondogbia","3","1"));
        jugadorlist2.add(new Jugador("Pereira","1","3"));
        jugadorlist2.add(new Jugador("Soler","1","4"));
        jugadorlist2.add(new Jugador("Vidal","1","0"));
        jugadorlist2.add(new Jugador("Gayá","0","3"));

        List<Jugador> jugadorlist3 = new ArrayList<Jugador>();

        jugadorlist3.add(new Jugador("Asensio","4","3"));
        jugadorlist3.add(new Jugador("Bale","4","1"));
        jugadorlist3.add(new Jugador("Isco","4","4"));
        jugadorlist3.add(new Jugador("Ronaldo","4","2"));
        jugadorlist3.add(new Jugador("Casemiro","3","0"));
        jugadorlist3.add(new Jugador("Benzemá","2","3"));
        jugadorlist3.add(new Jugador("Ceballos","2","0"));
        jugadorlist3.add(new Jugador("Kroos","2","2"));
        jugadorlist3.add(new Jugador("Hakimi","1","0"));
        jugadorlist3.add(new Jugador("Lucas Vázquez","1","1"));


        List<Jugador> jugadorlist4 = new ArrayList<Jugador>();

        jugadorlist4.add(new Jugador("Bakambu","9","0"));
        jugadorlist4.add(new Jugador("Bacca","5","3"));
        jugadorlist4.add(new Jugador("Sansone","3","1"));
        jugadorlist4.add(new Jugador("Unal","3","1"));
        jugadorlist4.add(new Jugador("Fornals","2","6"));
        jugadorlist4.add(new Jugador("Castillejo","1","3"));
        jugadorlist4.add(new Jugador("Mario","1","1"));
        jugadorlist4.add(new Jugador("Trigueros","1","3"));
        jugadorlist4.add(new Jugador("Álvaro","0","1"));
        jugadorlist4.add(new Jugador("Cheryshev","0","1"));

        List<Jugador> jugadorlist5 = new ArrayList<Jugador>();

        jugadorlist5.add(new Jugador("Ben Yedder","5","0"));
        jugadorlist5.add(new Jugador("Lenglet","3","0"));
        jugadorlist5.add(new Jugador("Muriel","3","0"));
        jugadorlist5.add(new Jugador("Banega","2","2"));
        jugadorlist5.add(new Jugador("Ganso","2","0"));
        jugadorlist5.add(new Jugador("Nolito","2","4"));
        jugadorlist5.add(new Jugador("Kjaer","1","0"));
        jugadorlist5.add(new Jugador("Krohn-Dehli","1","1"));
        jugadorlist5.add(new Jugador("Navas","1","0"));
        jugadorlist5.add(new Jugador("Pizarro","1","0"));


        List<Jugador> jugadorlist6 = new ArrayList<Jugador>();

        jugadorlist6.add(new Jugador("Charles","6","1"));
        jugadorlist6.add(new Jugador("Jordán","5","1"));
        jugadorlist6.add(new Jugador("Enrich","3","1"));
        jugadorlist6.add(new Jugador("Inui","3","1"));
        jugadorlist6.add(new Jugador("Alejo","1","3"));
        jugadorlist6.add(new Jugador("Arbilla","1","0"));
        jugadorlist6.add(new Jugador("Escalante","1","0"));
        jugadorlist6.add(new Jugador("Orellana","1","0"));
        jugadorlist6.add(new Jugador("Capa","0","1"));


        List<Jugador> jugadorlist7 = new ArrayList<Jugador>();

        jugadorlist7.add(new Jugador("Ángel","6","1"));
        jugadorlist7.add(new Jugador("Bergara","4","1"));
        jugadorlist7.add(new Jugador("Molina","4","2"));
        jugadorlist7.add(new Jugador("Cala","2","1"));
        jugadorlist7.add(new Jugador("Ndiaye","2","0"));
        jugadorlist7.add(new Jugador("Arambarri","1","0"));
        jugadorlist7.add(new Jugador("Fajr","1","2"));
        jugadorlist7.add(new Jugador("Jiménez","1","1"));
        jugadorlist7.add(new Jugador("Portillo","1","2"));
        jugadorlist7.add(new Jugador("Shibasaki","1","0"));


        List<Jugador> jugadorlist8 = new ArrayList<Jugador>();

        jugadorlist8.add(new Jugador("Stuani","10","0"));
        jugadorlist8.add(new Jugador("Portu","7","1"));
        jugadorlist8.add(new Jugador("Olunga","3","1"));
        jugadorlist8.add(new Jugador("B.García","2","2"));
        jugadorlist8.add(new Jugador("Juanpe","2","1"));
        jugadorlist8.add(new Jugador("Timor","2","0"));
        jugadorlist8.add(new Jugador("Aday","1","0"));
        jugadorlist8.add(new Jugador("Alcala","1","0"));
        jugadorlist8.add(new Jugador("Espinosa","0","2"));


        List<Jugador> jugadorlist9 = new ArrayList<Jugador>();

        jugadorlist9.add(new Jugador("Aduriz","7","1"));
        jugadorlist9.add(new Jugador("Raul García","4","1"));
        jugadorlist9.add(new Jugador("Williams","3","3"));
        jugadorlist9.add(new Jugador("Etxeita","1","0"));
        jugadorlist9.add(new Jugador("Muniain","1","2"));
        jugadorlist9.add(new Jugador("Susaeta","1","2"));
        jugadorlist9.add(new Jugador("Vesga","1","1"));
        jugadorlist9.add(new Jugador("Balenciaga","0","2"));
        jugadorlist9.add(new Jugador("Bóveda","0","1"));


        List<Jugador> jugadorlist10 = new ArrayList<Jugador>();

        jugadorlist10.add(new Jugador("Gabriel","4","1"));
        jugadorlist10.add(new Jugador("Beauvue","2","0"));
        jugadorlist10.add(new Jugador("Szymanowski","2","2"));
        jugadorlist10.add(new Jugador("El Zhar","1","0"));
        jugadorlist10.add(new Jugador("Eraso","1","2"));
        jugadorlist10.add(new Jugador("Guerrero","1","0"));
        jugadorlist10.add(new Jugador("Rico","1","0"));
        jugadorlist10.add(new Jugador("Amrabat","0","3"));


        List<Jugador> jugadorlist11 = new ArrayList<Jugador>();

        jugadorlist11.add(new Jugador("Sanabria","7","0"));
        jugadorlist11.add(new Jugador("León","6","1"));
        jugadorlist11.add(new Jugador("Feddal","3","0"));
        jugadorlist11.add(new Jugador("Joaquín","3","4"));
        jugadorlist11.add(new Jugador("Tello","3","3"));
        jugadorlist11.add(new Jugador("Ruiz","2","2"));
        jugadorlist11.add(new Jugador("Boudebouz","1","1"));
        jugadorlist11.add(new Jugador("Camarasa","1","0"));
        jugadorlist11.add(new Jugador("Campbell","1","1"));
        jugadorlist11.add(new Jugador("Durmisi","1","2"));


        List<Jugador> jugadorlist12 = new ArrayList<Jugador>();

        jugadorlist12.add(new Jugador("Willian José","7","1"));
        jugadorlist12.add(new Jugador("Oyarzabal","6","3"));
        jugadorlist12.add(new Jugador("Illarramendi","3","3"));
        jugadorlist12.add(new Jugador("Juanmi","3","1"));
        jugadorlist12.add(new Jugador("Elustondo","2","1"));
        jugadorlist12.add(new Jugador("Januzaj","2","3"));
        jugadorlist12.add(new Jugador("Llorente","2","0"));
        jugadorlist12.add(new Jugador("Xabi Prieto","2","3"));
        jugadorlist12.add(new Jugador("Iñigo Matrínez","1","1"));
        jugadorlist12.add(new Jugador("K.Rodrigues","1","2"));


        List<Jugador> jugadorlist13 = new ArrayList<Jugador>();

        jugadorlist13.add(new Jugador("Moreno","7","0"));
        jugadorlist13.add(new Jugador("Baptistao","3","3"));
        jugadorlist13.add(new Jugador("Darder","1","0"));
        jugadorlist13.add(new Jugador("S.García","1","2"));
        jugadorlist13.add(new Jugador("Piatti","1","2"));


        List<Jugador> jugadorlist14 = new ArrayList<Jugador>();

        jugadorlist14.add(new Jugador("I.Aspas","11","3"));
        jugadorlist14.add(new Jugador("M.Gómez","8","2"));
        jugadorlist14.add(new Jugador("Sisto","3","9"));
        jugadorlist14.add(new Jugador("Hernández","2","0"));
        jugadorlist14.add(new Jugador("Cabral","1","1"));
        jugadorlist14.add(new Jugador("Emre Mor","1","0"));
        jugadorlist14.add(new Jugador("Fontàs","0","1"));


        List<Jugador> jugadorlist15 = new ArrayList<Jugador>();

        jugadorlist15.add(new Jugador("Bardhi","4","0"));
        jugadorlist15.add(new Jugador("Morales","4","2"));
        jugadorlist15.add(new Jugador("Ivi","2","2"));
        jugadorlist15.add(new Jugador("Chema","1","0"));
        jugadorlist15.add(new Jugador("Doukouré","1","0"));
        jugadorlist15.add(new Jugador("Jason","1","0"));


        List<Jugador> jugadorlist16 = new ArrayList<Jugador>();

        jugadorlist16.add(new Jugador("F.Andone","5","2"));
        jugadorlist16.add(new Jugador("L.Pérez","4","1"));
        jugadorlist16.add(new Jugador("Adrián","3","3"));
        jugadorlist16.add(new Jugador("C.Borges","3","1"));
        jugadorlist16.add(new Jugador("Cartabria","2","1"));
        jugadorlist16.add(new Jugador("Schar","2","1"));
        jugadorlist16.add(new Jugador("Luisinho","1","1"));
        jugadorlist16.add(new Jugador("Sidnei","1","1"));
        jugadorlist16.add(new Jugador("Çolak","0","1"));


        List<Jugador> jugadorlist17 = new ArrayList<Jugador>();

        jugadorlist17.add(new Jugador("I.Gómez","4","2"));
        jugadorlist17.add(new Jugador("El Haddadi","3","3"));
        jugadorlist17.add(new Jugador("Santos","2","0"));
        jugadorlist17.add(new Jugador("Alexis","1","0"));
        jugadorlist17.add(new Jugador("Burgui","1","0"));
        jugadorlist17.add(new Jugador("M.García","1","0"));
        jugadorlist17.add(new Jugador("Medrán","1","0"));
        jugadorlist17.add(new Jugador("Duarte","0","2"));


        List<Jugador> jugadorlist18 = new ArrayList<Jugador>();

        jugadorlist18.add(new Jugador("C.Castro","3","1"));
        jugadorlist18.add(new Jugador("Rolán","3","0"));
        jugadorlist18.add(new Jugador("Bastón","2","0"));
        jugadorlist18.add(new Jugador("Adrián","1","0"));
        jugadorlist18.add(new Jugador("Baysse","1","0"));
        jugadorlist18.add(new Jugador("González","1","0"));
        jugadorlist18.add(new Jugador("Recio","1","1"));
        jugadorlist18.add(new Jugador("Rosales","1","0"));


        List<Jugador> jugadorlist19 = new ArrayList<Jugador>();

        jugadorlist19.add(new Jugador("Remy","5","0"));
        jugadorlist19.add(new Jugador("Calleri","4","0"));
        jugadorlist19.add(new Jugador("Viera","3","3"));
        jugadorlist19.add(new Jugador("Gálvez","1","0"));
        jugadorlist19.add(new Jugador("Placeres","1","1"));
        jugadorlist19.add(new Jugador("Castellano","0","2"));

        List<Equipo> equipoList = new ArrayList<Equipo>();

        equipoList.add(new Equipo("FC Barcelona","51","19","16","0","3",jugadorlist));
        equipoList.add(new Equipo("Atlético","42","19","12","1","6",jugadorlist1));
        equipoList.add(new Equipo("Valencia","40","19","12","3","4",jugadorlist2));
        equipoList.add(new Equipo("Madrid","32","18","9","4","5",jugadorlist3));
        equipoList.add(new Equipo("Villarreal","31","19","9","6","4",jugadorlist4));
        equipoList.add(new Equipo("Sevilla","29","18","9","7","2",jugadorlist5));
        equipoList.add(new Equipo("Eibar","27","19","8","8","3",jugadorlist6));
        equipoList.add(new Equipo("Getafe","26","19","7","7","5",jugadorlist7));
        equipoList.add(new Equipo("Girona","26","19","7","7","5",jugadorlist8));
        equipoList.add(new Equipo("Ath. Club","24","18","6","6","6",jugadorlist9));
        equipoList.add(new Equipo("Leganés","24","17","7","7","3",jugadorlist10));
        equipoList.add(new Equipo("Betis","24","18","7","8","3",jugadorlist11));
        equipoList.add(new Equipo("Real Sociedad","23","18","6","7","5",jugadorlist12));
        equipoList.add(new Equipo("Espanyol","23","18","6","7","5",jugadorlist13));
        equipoList.add(new Equipo("Celta","22","18","6","8","4",jugadorlist14));
        equipoList.add(new Equipo("Levante","18","18","3","6","9",jugadorlist15));
        equipoList.add(new Equipo("Deportivo","16","19","4","11","4",jugadorlist16));
        equipoList.add(new Equipo("Alavés","15","18","5","13","0",jugadorlist17));
        equipoList.add(new Equipo("Málaga","11","19","3","14","2",jugadorlist18));
        equipoList.add(new Equipo("Las Palmas","11","19","3","14","2",jugadorlist19));

        mDatabase.setValue(new Equipos(equipoList));


    }

    //Actualitza les Jornades: Creem una llista de les jornades de la lliga omplint tots els camps
    //requerits a la classe JornadasList creada. Com aquesta classe inclou una llista dels partits,
    // la hem de crear també omplint els camps requerits a la classe Partidos, i pujem tot al Firebase
    @NonNull
    private void actualizaJornadasPartidos() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Jornadas");

        List<JornadasList> jlist0 = new ArrayList<JornadasList>();

        List<Partidos> plist0 = new ArrayList<Partidos>();
        plist0.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist0.add(new Partidos("Girona","Atlético","2","2","19/08/2017","FIN"));
        plist0.add(new Partidos("Sevilla","Espanyol","1","1","19/08/2017","FIN"));
        plist0.add(new Partidos("Ath. Club","Getafe","0","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Barcelona","Betis","2","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Deportivo","Madrid","0","3","20/08/2017","FIN"));
        plist0.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist0.add(new Partidos("Málaga","Eibar","0","1","21/08/2017","FIN"));


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
        plist2.add(new Partidos("Leganés","Getafe","1","2","08/09/2017","FIN"));
        plist2.add(new Partidos("Madrid","Levante","1","1","09/09/2017","FIN"));
        plist2.add(new Partidos("Valencia", "Atlético","0","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Sevilla","Eibar","3","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Barcelona","Espanyol","5","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Deportivo","Real Sociedad","2","4","10/09/2017","FIN"));
        plist2.add(new Partidos("Ath. Club","Girona","2","0","10/09/2017","FIN"));
        plist2.add(new Partidos("Celta","Alavés","1","0","10/09/2017","FIN"));
        plist2.add(new Partidos("Villarreal","Betis","3","1","10/09/2017","FIN"));
        plist2.add(new Partidos("Málaga","Las Palmas","1","3","11/09/2017","FIN"));


        List<Partidos> plist3 = new ArrayList<Partidos>();
        plist3.add(new Partidos("Eibar","Leganés","1","0","15/09/2017","FIN"));
        plist3.add(new Partidos("Levante","Valencia","1","1","16/09/2017","FIN"));
        plist3.add(new Partidos("Getafe","Barcelona","1","2","16/09/2017","FIN"));
        plist3.add(new Partidos("Betis","Deportivo","2","1","16/09/2017","FIN"));
        plist3.add(new Partidos("Atlético","Málaga","1","0","16/09/2017","FIN"));
        plist3.add(new Partidos("Alavés","Villarreal","0","3","17/09/2017","FIN"));
        plist3.add(new Partidos("Girona","Sevilla","0","1","17/09/2017","FIN"));
        plist3.add(new Partidos("Las Palmas","Ath. Club","1","0","17/09/2017","FIN"));
        plist3.add(new Partidos("Real Sociedad","Madrid","1","3","17/09/2017","FIN"));
        plist3.add(new Partidos("Espanyol","Celta","2","1","18/09/2017","FIN"));


        List<Partidos> plist4 = new ArrayList<Partidos>();
        plist4.add(new Partidos("Valencia","Málaga","5","0","19/09/2017","FIN"));
        plist4.add(new Partidos("Barcelona","Eibar","6","1","19/09/2017","FIN"));
        plist4.add(new Partidos("Leganés", "Girona","0","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Ath. Club","Atlético","1","2","20/09/2017","FIN"));
        plist4.add(new Partidos("Deportivo","Alavés","1","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Sevilla","Las Palmas","1","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Madrid","Betis","0","1","20/09/2017","FIN"));
        plist4.add(new Partidos("Villarreal","Espanyol","0","0","21/09/2017","FIN"));
        plist4.add(new Partidos("Celta","Getafe","1","1","21/09/2017","FIN"));
        plist4.add(new Partidos("Levante","Real Sociedad","2","2","21/09/2017","FIN"));


        List<Partidos> plist5 = new ArrayList<Partidos>();
        plist5.add(new Partidos("Atlético","Sevilla","2","0","23/09/2017","FIN"));
        plist5.add(new Partidos("Alavés","Madrid","1","2","23/09/2017","FIN"));
        plist5.add(new Partidos("Málaga", "Ath. Club","3","3","23/09/2017","FIN"));
        plist5.add(new Partidos("Girona","Barcelona","0","3","23/09/2017","FIN"));
        plist5.add(new Partidos("Espanyol","Deportivo","4","1","24/09/2017","FIN"));
        plist5.add(new Partidos("Getafe","Villarreal","4","0","24/09/2017","FIN"));
        plist5.add(new Partidos("Las Palmas","Leganés","0","2","24/09/2017","FIN"));
        plist5.add(new Partidos("Eibar","Celta","0","4","24/09/2017","FIN"));
        plist5.add(new Partidos("Real Sociedad","Valencia","2","3","24/09/2017","FIN"));
        plist5.add(new Partidos("Betis","Levante","4","0","25/09/2017","FIN"));


        List<Partidos> plist6 = new ArrayList<Partidos>();
        plist6.add(new Partidos("Celta","Girona","3","3","29/09/2017","FIN"));
        plist6.add(new Partidos("Deportivo","Getafe","2","1","30/09/2017","FIN"));
        plist6.add(new Partidos("Sevilla","Málaga","2","0","30/09/2017","FIN"));
        plist6.add(new Partidos("Levante","Alavés","0","2","30/09/2017","FIN"));
        plist6.add(new Partidos("Leganés","Atlético","0","0","30/09/2017","FIN"));
        plist6.add(new Partidos("Real Sociedad","Betis","4","4","01/10/2017","FIN"));
        plist6.add(new Partidos("Barcelona","Las Palmas","3","0","01/10/2017","FIN"));
        plist6.add(new Partidos("Villarreal","Eibar","3","0","01/10/2017","FIN"));
        plist6.add(new Partidos("Valencia","Ath. Club","3","2","01/10/2017","FIN"));
        plist6.add(new Partidos("Madrid","Espanyol","2","0","01/10/2017","FIN"));


        List<Partidos> plist7 = new ArrayList<Partidos>();
        plist7.add(new Partidos("Espanyol","Levante","0","0","13/10/2017","FIN"));
        plist7.add(new Partidos("Ath. Club","Sevilla","1","0","14/10/2017","FIN"));
        plist7.add(new Partidos("Getafe", "Madrid","1","2","14/10/2017","FIN"));
        plist7.add(new Partidos("Alavés","Real Sociedad","0","2","14/10/2017","FIN"));
        plist7.add(new Partidos("Atlético","Barcelona","1","1","14/10/2017","FIN"));
        plist7.add(new Partidos("Eibar","Deportivo","0","0","15/10/2017","FIN"));
        plist7.add(new Partidos("Girona","Villarreal","1","2","15/10/2017","FIN"));
        plist7.add(new Partidos("Málaga","Leganés","0","2","15/10/2017","FIN"));
        plist7.add(new Partidos("Betis","Valencia","3","6","15/10/2017","FIN"));
        plist7.add(new Partidos("Las Palmas","Celta","2","5","16/10/2017","FIN"));


        List<Partidos> plist8 = new ArrayList<Partidos>();
        plist8.add(new Partidos("Levante","Getafe","1","1","21/10/2017","FIN"));
        plist8.add(new Partidos("Betis","Alavés","2","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Valencia", "Sevilla","4","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Barcelona","Málaga","2","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Villarreal","Las Palmas","4","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Celta","Atlético","0","1","22/10/2017","FIN"));
        plist8.add(new Partidos("Leganés","Ath. Club","1","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Madrid","Eibar","3","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Real Sociedad","Espanyol","1","1","23/10/2017","FIN"));
        plist8.add(new Partidos("Deportivo","Girona","1","2","23/10/2017","FIN"));


        List<Partidos> plist9 = new ArrayList<Partidos>();
        plist9.add(new Partidos("Alavés","Valencia","1","2","28/10/2017","FIN"));
        plist9.add(new Partidos("Atlético","Villarreal","1","1","28/10/2017","FIN"));
        plist9.add(new Partidos("Ath. Club","Barcelona","0","2","28/10/2017","FIN"));
        plist9.add(new Partidos("Sevilla","Leganés","2","1","28/10/2017","FIN"));
        plist9.add(new Partidos("Getafe","Real Sociedad","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Girona","Madrid","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Eibar","Levante","2","2","29/10/2017","FIN"));
        plist9.add(new Partidos("Málaga","Celta","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Las Palmas","Deportivo","1","3","30/10/2017","FIN"));
        plist9.add(new Partidos("Espanyol","Betis","1","0","30/10/2017","FIN"));


        List<Partidos> plist10 = new ArrayList<Partidos>();
        plist10.add(new Partidos("Betis","Getafe","2","2","03/11/2017","FIN"));
        plist10.add(new Partidos("Valencia","Leganés","3","0","04/11/2017","FIN"));
        plist10.add(new Partidos("Deportivo", "Atlético","0","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Alavés","Espanyol","1","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Barcelona","Sevilla","2","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Levante","Girona","1","2","05/11/2017","FIN"));
        plist10.add(new Partidos("Celta","Ath. Club","3","1","05/11/2017","FIN"));
        plist10.add(new Partidos("Villarreal","Málaga","2","0","05/11/2017","FIN"));
        plist10.add(new Partidos("Real Sociedad","Eibar","3","1","05/11/2017","FIN"));
        plist10.add(new Partidos("Madrid","Las Palmas","3","0","05/11/2017","FIN"));


        List<Partidos> plist11 = new ArrayList<Partidos>();
        plist11.add(new Partidos("Girona","Real Sociedad","1","1","17/11/2017","FIN"));
        plist11.add(new Partidos("Getafe","Alavés","4","1","18/11/2017","FIN"));
        plist11.add(new Partidos("Leganés", "Barcelona","0","3","18/11/2017","FIN"));
        plist11.add(new Partidos("Sevilla","Celta","2","1","18/11/2017","FIN"));
        plist11.add(new Partidos("Atlético","Madrid","0","0","18/11/2017","FIN"));
        plist11.add(new Partidos("Málaga","Deportivo","3","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Espanyol","Valencia","0","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Las Palmas","Levante","0","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Ath. Club","Villarreal","1","1","19/11/2017","FIN"));
        plist11.add(new Partidos("Eibar","Betis","5","0","20/11/2017","FIN"));


        List<Partidos> plist12 = new ArrayList<Partidos>();
        plist12.add(new Partidos("Celta","Leganés","1","0","24/11/2017","FIN"));
        plist12.add(new Partidos("Alavés","Eibar","1","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Madrid", "Málaga","3","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Betis","Girona","2","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Levante","Atlético","0","5","25/11/2017","FIN"));
        plist12.add(new Partidos("Deportivo","Ath. Club","2","2","26/11/2017","FIN"));
        plist12.add(new Partidos("Real Sociedad","Las Palmas","2","2","26/11/2017","FIN"));
        plist12.add(new Partidos("Villarreal","Sevilla","2","3","26/11/2017","FIN"));
        plist12.add(new Partidos("Valencia","Barcelona","1","1","26/11/2017","FIN"));
        plist12.add(new Partidos("Espanyol","Getafe","1","0","27/11/2017","FIN"));


        List<Partidos> plist13 = new ArrayList<Partidos>();
        plist13.add(new Partidos("Málaga","Levante","0","0","01/12/2017","FIN"));
        plist13.add(new Partidos("Barcelona","Celta","2","2","02/12/2017","FIN"));
        plist13.add(new Partidos("Atlético","Real Sociedad","2","1","02/12/2017","FIN"));
        plist13.add(new Partidos("Sevilla","Deportivo","2","0","02/12/2017","FIN"));
        plist13.add(new Partidos("Ath. Club","Madrid","0","0","02/12/2017","FIN"));
        plist13.add(new Partidos("Leganés","Villarreal","3","1","03/12/2017","FIN"));
        plist13.add(new Partidos("Getafe","Valencia","1","0","03/12/2017","FIN"));
        plist13.add(new Partidos("Eibar","Espanyol","3","1","03/12/2017","FIN"));
        plist13.add(new Partidos("Las Palmas","Betis","1","0","03/12/2017","FIN"));
        plist13.add(new Partidos("Girona","Alavés","2","3","04/12/2017","FIN"));

        List<Partidos> plist14 = new ArrayList<Partidos>();
        plist14.add(new Partidos("Alavés","Las Palmas","2","0","08/12/2017","FIN"));
        plist14.add(new Partidos("Getafe","Eibar","0","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Madrid", "Sevilla","5","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Deportivo","Leganés","1","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Valencia","Celta","1","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Real Sociedad","Málaga","0","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Betis","Atlético","0","1","10/12/2017","FIN"));
        plist14.add(new Partidos("Levante","Ath. Club","1","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Villarreal","Barcelona","0","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Espanyol","Girona","0","1","11/12/2017","FIN"));


        List<Partidos> plist15 = new ArrayList<Partidos>();
        plist15.add(new Partidos("Sevilla","Levante","0","0","15/12/2017","FIN"));
        plist15.add(new Partidos("Ath. Club","Real Sociedad","0","0","16/12/2017","FIN"));
        plist15.add(new Partidos("Eibar", "Valencia","2","1","16/12/2017","FIN"));
        plist15.add(new Partidos("Atlético","Alavés","1","0","16/12/2017","FIN"));
        plist15.add(new Partidos("Madrid","Leganés","2","0","Por definirse","FIN"));
        plist15.add(new Partidos("Girona","Getafe","1","0","17/12/2017","FIN"));
        plist15.add(new Partidos("Celta","Villarreal","0","1","17/12/2017","FIN"));
        plist15.add(new Partidos("Las Palmas","Espanyol","2","2","17/12/2017","FIN"));
        plist15.add(new Partidos("Barcelona","Deportivo","4","0","17/12/2017","FIN"));
        plist15.add(new Partidos("Málaga","Betis","0","2","18/12/2017","FIN"));


        List<Partidos> plist16 = new ArrayList<Partidos>();
        plist16.add(new Partidos("Levante","Leganés","0","0","19/12/2017","FIN"));
        plist16.add(new Partidos("Getafe","Las Palmas","2","0","20/12/2017","FIN"));
        plist16.add(new Partidos("Real Sociedad","Sevilla","3","1","20/12/2017","FIN"));
        plist16.add(new Partidos("Eibar","Girona","4","1","21/12/2017","FIN"));
        plist16.add(new Partidos("Alavés","Málaga","1","0","21/12/2017","FIN"));
        plist16.add(new Partidos("Betis","Ath. Club","0","2","22/12/2017","FIN"));
        plist16.add(new Partidos("Espanyol","Atlético","1","0","22/12/2017","FIN"));
        plist16.add(new Partidos("Madrid","Barcelona","0","3","23/12/2017","FIN"));
        plist16.add(new Partidos("Valencia","Villarreal","0","1","23/12/2017","FIN"));
        plist16.add(new Partidos("Deportivo","Celta","1","3","23/12/2017","FIN"));


        List<Partidos> plist17 = new ArrayList<Partidos>();
        plist17.add(new Partidos("Atlético","Getafe","2","0","06/01/2018","FIN"));
        plist17.add(new Partidos("Valencia","Girona","2","1","06/01/2018","FIN"));
        plist17.add(new Partidos("Las Palmas", "Eibar","1","2","06/01/2018","FIN"));
        plist17.add(new Partidos("Sevilla","Betis","3","5","06/01/2018","FIN"));
        plist17.add(new Partidos("Leganés","Real Sociedad","1","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Barcelona","Levante","3","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Villarreal","Deportivo","1","1","07/01/2018","FIN"));
        plist17.add(new Partidos("Ath. Club","Alavés","2","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Celta","Madrid","2","2","07/01/2018","FIN"));
        plist17.add(new Partidos("Málaga","Espanyol","0","1","08/01/2018","FIN"));


        List<Partidos> plist18 = new ArrayList<Partidos>();
        plist18.add(new Partidos("Getafe","Málaga","1","0","12/01/2018","FIN"));
        plist18.add(new Partidos("Girona","Las Palmas","6","0","13/01/2018","FIN"));
        plist18.add(new Partidos("Madrid","Villarreal","0","1","13/01/2018","FIN"));
        plist18.add(new Partidos("Eibar","Atlético","0","1","13/01/2018","FIN"));
        plist18.add(new Partidos("Deportivo","Valencia","-","-","13/01/2018","20.45"));
        plist18.add(new Partidos("Levante","Celta","-","-","14/01/2018","12.00"));
        plist18.add(new Partidos("Alavés","Sevilla","-","-","14/01/2018","16.15"));
        plist18.add(new Partidos("Espanyol","Ath. Club","-","-","14/01/2018","18.30"));
        plist18.add(new Partidos("Real Sociedad","Barcelona","-","-","14/01/2018","20.45"));
        plist18.add(new Partidos("Betis","Leganés","-","-","15/01/2018","21.00"));


        List<Partidos> plist19 = new ArrayList<Partidos>();
        plist19.add(new Partidos("Getafe","Ath. Club","-","-","19/01/2018","21.00"));
        plist19.add(new Partidos("Espanyol","Sevilla","-","-","20/01/2018","13.00"));
        plist19.add(new Partidos("Atlético", "Girona","-","-","20/01/2018","16.15"));
        plist19.add(new Partidos("Villarreal","Levante","-","-","20/01/2018","18.30"));
        plist19.add(new Partidos("Las Palmas","Valencia","-","-","20/01/2018","20.45"));
        plist19.add(new Partidos("Alavés","Leganés","-","-","21/01/2018","12.00"));
        plist19.add(new Partidos("Madrid","Deportivo","-","-","21/01/2018","16.15"));
        plist19.add(new Partidos("Real Sociedad","Celta","-","-","21/01/2018","18.30"));
        plist19.add(new Partidos("Betis","Barcelona","-","-","21/01/2018","20.45"));
        plist19.add(new Partidos("Eibar","Málaga","-","-","22/01/2018","21.00"));


        List<Partidos> plist20 = new ArrayList<Partidos>();
        plist20.add(new Partidos("Ath. Club","Eibar","-","-","26/01/2018","21.00"));
        plist20.add(new Partidos("Deportivo","Levante","-","-","27/01/2018","13.00"));
        plist20.add(new Partidos("Valencia","Madrid","-","-","27/01/2018","16.15"));
        plist20.add(new Partidos("Málaga","Girona","-","-","27/01/2018","18.30"));
        plist20.add(new Partidos("Villarreal","Real Sociedad","-","-","27/01/2018","20.45"));
        plist20.add(new Partidos("Leganés","Espanyol","-","-","28/01/2018","12.00"));
        plist20.add(new Partidos("Atlético","Las Palmas","-","-","28/01/2018","16.15"));
        plist20.add(new Partidos("Sevilla","Getafe","-","-","28/01/2018","18.30"));
        plist20.add(new Partidos("Bacelona","Alavés","-","-","28/01/2018","20.45"));
        plist20.add(new Partidos("Celta", "Betis","-","-","29/01/2018","21.00"));


        List<Partidos> plist21 = new ArrayList<Partidos>();
        plist21.add(new Partidos("Real Sociedad","Deportivo","-","-","02/02/2018","21.00"));
        plist21.add(new Partidos("Eibar","Sevilla","-","-","03/02/2018","13.00"));
        plist21.add(new Partidos("Betis","Villarreal","-","-","03/02/2018","16.15"));
        plist21.add(new Partidos("Alavés","Celta","-","-","03/02/2018","18.30"));
        plist21.add(new Partidos("Levante","Madrid","-","-","03/02/2018","20.45"));
        plist21.add(new Partidos("Getafe","Leganés","-","-","04/02/2018","12.00"));
        plist21.add(new Partidos("Espanyol","Barcelona","-","-","04/02/2018","16.15"));
        plist21.add(new Partidos("Girona","Ath. Club","-","-","04/02/2018","18.30"));
        plist21.add(new Partidos("Atlético","Valencia","-","-","04/02/2018","20.45"));
        plist21.add(new Partidos("Las Palmas","Málaga","-","-","05/02/2018","21.00"));


        List<Partidos> plist22 = new ArrayList<Partidos>();
        plist22.add(new Partidos("Villarreal","Alavés","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Valencia","Levante","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Sevilla", "Girona","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Madrid","Real Sociedad","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Málaga","Atlético","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Leganés","Eibar","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Deportivo","Betis","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Celta","Espanyol","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Barcelona","Getafe","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Ath. Club","Las Palmas","-","-","11/02/2018","17.00"));

        List<Partidos> plist23 = new ArrayList<Partidos>();
        plist23.add(new Partidos("Atlético","Ath. Club","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Eibar","Barcelona","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Getafe", "Celta","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Alavés","Deportivo","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Espanyol","Villarreal","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Las Palmas","Sevilla","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Málaga","Valencia","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Girona","Leganés","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Real Sociedad","Levante","-","-","18/02/2018","Por definir"));
        plist23.add(new Partidos("Betis","Madrid","-","-","18/02/2018","Por definir"));


        List<Partidos> plist24 = new ArrayList<Partidos>();
        plist24.add(new Partidos("Sevilla","Atético","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Levante","Betis","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Deportivo", "Espanyol","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Valencia","Real Sociedad","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Barcelona","Girona","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Celta","Eibar","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Villarreal","Getafe","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Leganés","Las Palmas","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Ath. Club","Málaga","-","-","25/02/2018","Por definir"));
        plist24.add(new Partidos("Madrid","Alavés","-","-","25/02/2018","Por definir"));


        List<Partidos> plist25 = new ArrayList<Partidos>();
        plist25.add(new Partidos("Las Palmas","Barcelona","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Girona","Celta","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Getafe", "Deportivo","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Espanyol","Madrid","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Eibar","Villarreal","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Málaga","Sevilla","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Ath. Club","Valencia","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Atlético","Leganés","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Alavés","Levante","-","-","28/02/2018","Por definir"));
        plist25.add(new Partidos("Betis","Real Sociedad","-","-","28/02/2018","Por definir"));


        List<Partidos> plist26 = new ArrayList<Partidos>();
        plist26.add(new Partidos("Sevilla","Ath. Club","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Barcelona","Atlético","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Valncia", "Betis","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Levante","Espanyol","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Villarreal","Girona","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Deportivo","Eibar","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Madrid","Getafe","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Celta","Las Palmas","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Leganés","Málaga","-","-","04/03/2018","Por definir"));
        plist26.add(new Partidos("Real Sociedad","Alavés","-","-","04/03/2018","Por definir"));


        List<Partidos> plist27 = new ArrayList<Partidos>();
        plist27.add(new Partidos("Málaga","Barcelona","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Alavés","Betis","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Atlético", "Celta","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Girona","Deportivo","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Las Palmas","Villarreal","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Espayol","Real Sociedad","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Sevilla","Valencia","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Ath. Club","Leganés","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Getafe","Levante","-","-","11/03/2018","Por definir"));
        plist27.add(new Partidos("Eibar","Madrid","-","-","11/03/2018","Por definir"));


        List<Partidos> plist28 = new ArrayList<Partidos>();
        plist28.add(new Partidos("Barcelona","Ath. Club","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Villarreal","Atlético","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Betis", "Espanyol","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Leganés","Sevilla","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Madrid","Girona","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Levante","Eibar","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Real Sociedad","Getafe","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Deportivo","Las Palmas","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Celta","Málaga","-","-","18/03/2018","Por definir"));
        plist28.add(new Partidos("Valencia","Alavés","-","-","18/03/2018","Por definir"));


        List<Partidos> plist29 = new ArrayList<Partidos>();
        plist29.add(new Partidos("Málaga","Villarreal","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Espanyol","Alavés","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Atlétio", "Deportivo","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Las Palmas","Madrid","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Sevilla","Barcelona","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Getafe","Betis","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Leganés","Valencia","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Girona","Levante","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Ath. Club","Celta","-","-","01/04/2018","Por definir"));
        plist29.add(new Partidos("Eibar","Real Sociedad","-","-","01/04/2018","Por definir"));


        List<Partidos> plist30 = new ArrayList<Partidos>();
        plist30.add(new Partidos("Betis","Eibar","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Alavés","Getafe","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Deportivo", "Málaga","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Celta","Sevilla","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Barcelona","Leganés","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Levante","Las Palmas","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Madrid","Atlético","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Villarreal","Ath. Club","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Real Sociedad","Girona","-","-","08/04/2018","Por definir"));
        plist30.add(new Partidos("Valencia","Espanyol","-","-","08/04/2018","Por definir"));


        List<Partidos> plist31 = new ArrayList<Partidos>();
        plist31.add(new Partidos("Atlético","Levante","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Barcelona","Valencia","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Girona", "Betis","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Leganés","Celta","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Eibar","Alavés","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Sevilla","Villarreal","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Ath. Club","Deportivo","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Málaga","Madrid","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Getafe","Espanyol","-","-","15/04/2018","Por definir"));
        plist31.add(new Partidos("Las Palmas","Real Sociedad","-","-","15/04/2018","Por definir"));


        List<Partidos> plist32 = new ArrayList<Partidos>();
        plist32.add(new Partidos("Alavés","Girona","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Espanyol","Eibar","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Madrid", "Ath. Club","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Real Sociedad","Atlético","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Betis","Las Palmas","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Villarreal","Leganés","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Levante","Málaga","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Deportivo","Sevilla","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Valencia","Getafe","-","-","18/04/2018","Por definir"));
        plist32.add(new Partidos("Barcelona","Celta","-","-","18/04/2018","Por definir"));


        List<Partidos> plist33 = new ArrayList<Partidos>();
        plist33.add(new Partidos("Ath. Club","Levante","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Málaga","Real Sociedad","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Girona", "Espanyol","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Las Palmas","Alavés","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Barcelona","Villarreal","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Eibar","Getafe","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Atlético","Betis","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Celta","Valencia","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Sevilla","Madrid","-","-","22/04/2018","Por definir"));
        plist33.add(new Partidos("Leganés","Deportivo","-","-","22/04/2018","Por definir"));


        List<Partidos> plist34 = new ArrayList<Partidos>();
        plist34.add(new Partidos("Villarreal","Celta","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Real Sociedad","Ath. Club","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Valencia", "Eibar","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Madrid","Leganés","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Espanyol","Las Palmas","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Betis","Málaga","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Deportivo","Barcelona","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Alavés","Atlético","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Getafe","Girona","-","-","29/04/2018","Por definir"));
        plist34.add(new Partidos("Levante","Sevilla","-","-","29/04/2018","Por definir"));


        List<Partidos> plist35 = new ArrayList<Partidos>();
        plist35.add(new Partidos("Atlético","Espanyol","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Villarreal","Valencia","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Málaga", "Alavés","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Barcelona","Madrid","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Sevilla","Real Sociedad","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Girona","Eibar","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Las Palmas","Getafe","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Ath. Club","Betis","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Celta","Depor","-","-","06/05/2018","Por definir"));
        plist35.add(new Partidos("Leganés","Levante","-","-","06/05/2018","Por definir"));


        List<Partidos> plist36 = new ArrayList<Partidos>();
        plist36.add(new Partidos("Real Sociedad","Leganés","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Alavés","Ath. Club","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Getafe", "Atlético","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Deportivo","Villarreal","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Eibar","Las Palmas","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Levante","Barcelona","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Betis","Sevilla","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Espanyol","Málaga","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Madrid","Celta","-","-","13/05/2018","Por definir"));
        plist36.add(new Partidos("Girona","Valencia","-","-","13/05/2018","Por definir"));


        List<Partidos> plist37 = new ArrayList<Partidos>();
        plist37.add(new Partidos("Atlético","Eibar","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Celta","Levante","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Málaga", "Getafe","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Barcelona","Real Sociedad","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Sevilla","Alavés","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Leganés","Betis","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Valencia","Deportivo","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Ath. Club","Espanyol","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Las Palmas","Girona","-","-","20/05/2018","Por definir"));
        plist37.add(new Partidos("Villarreal","Madrid","-","-","20/05/2018","Por definir"));


        jlist0.add(new JornadasList("Jornada1",plist0));
        jlist0.add(new JornadasList("Jornada2",plist1));
        jlist0.add(new JornadasList("Jornada3",plist2));
        jlist0.add(new JornadasList("Jornada4",plist3));
        jlist0.add(new JornadasList("Jornada5",plist4));
        jlist0.add(new JornadasList("Jornada6",plist5));
        jlist0.add(new JornadasList("Jornada7",plist6));
        jlist0.add(new JornadasList("Jornada8",plist7));
        jlist0.add(new JornadasList("Jornada9",plist8));
        jlist0.add(new JornadasList("Jornada10",plist9));
        jlist0.add(new JornadasList("Jornada11",plist10));
        jlist0.add(new JornadasList("Jornada12",plist11));
        jlist0.add(new JornadasList("Jornada13",plist12));
        jlist0.add(new JornadasList("Jornada14",plist13));
        jlist0.add(new JornadasList("Jornada15",plist14));
        jlist0.add(new JornadasList("Jornada16",plist15));
        jlist0.add(new JornadasList("Jornada17",plist16));
        jlist0.add(new JornadasList("Jornada18",plist17));
        jlist0.add(new JornadasList("Jornada19",plist18));
        jlist0.add(new JornadasList("Jornada20",plist19));
        jlist0.add(new JornadasList("Jornada21",plist20));
        jlist0.add(new JornadasList("Jornada22",plist21));
        jlist0.add(new JornadasList("Jornada23",plist22));
        jlist0.add(new JornadasList("Jornada24",plist23));
        jlist0.add(new JornadasList("Jornada25",plist24));
        jlist0.add(new JornadasList("Jornada26",plist25));
        jlist0.add(new JornadasList("Jornada27",plist26));
        jlist0.add(new JornadasList("Jornada28",plist27));
        jlist0.add(new JornadasList("Jornada29",plist28));
        jlist0.add(new JornadasList("Jornada30",plist29));
        jlist0.add(new JornadasList("Jornada31",plist30));
        jlist0.add(new JornadasList("Jornada32",plist31));
        jlist0.add(new JornadasList("Jornada33",plist32));
        jlist0.add(new JornadasList("Jornada34",plist33));
        jlist0.add(new JornadasList("Jornada35",plist34));
        jlist0.add(new JornadasList("Jornada36",plist35));
        jlist0.add(new JornadasList("Jornada37",plist36));
        jlist0.add(new JornadasList("Jornada38",plist37));

        mDatabase.setValue(new Jornadas(jlist0));
    }


}
