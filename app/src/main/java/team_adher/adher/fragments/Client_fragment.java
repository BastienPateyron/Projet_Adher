package team_adher.adher.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import team_adher.adher.R;


/**
 * Created by basti on 11/29/2017.
 */

public class Client_fragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.client_layout,container,false);

        /*Set Custom Title*/
        getActivity().setTitle(R.string.client);


        return myView;
    }
}
