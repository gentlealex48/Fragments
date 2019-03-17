package com.kkaty.fragments.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kkaty.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link YellowFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link YellowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YellowFragment extends Fragment {

    public static final  String TAG = YellowFragment.class.getSimpleName();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String FIRST_NAME_PARAM = "param1";
    private static final String LAST_NAME_PARAM = "param2";

    // TODO: Rename and change types of parameters
    private String firstName;
    private String lastName;

    private OnFragmentInteractionListener mListener;

    public YellowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment YellowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static YellowFragment newInstance(String param1, String param2) {
        YellowFragment fragment = new YellowFragment();
        Bundle args = new Bundle();
        args.putString(FIRST_NAME_PARAM, param1);
        args.putString(LAST_NAME_PARAM, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate:" + this.toString());

        //avoid a fragment from getting destroyed

        setRetainInstance(true);
        if (getArguments() != null) {
            firstName = getArguments().getString(FIRST_NAME_PARAM);
            lastName = getArguments().getString(LAST_NAME_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yellow, container, false);
    }



    // TODO: Rename method, update argument and hook method into UI event
   // public void onButtonPressed(Uri uri) {
      //  if (mListener != null) {
           // mListener.onFragmentInteraction(uri);
       // }
    //}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public  void onClick(View v){
        switch (v.getId()){
            case  R.id.btnSendData:

                //set the textview in the main
                onB

        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
