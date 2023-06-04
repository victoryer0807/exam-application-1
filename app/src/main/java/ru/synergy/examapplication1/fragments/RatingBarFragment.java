package ru.synergy.examapplication1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import ru.synergy.examapplication1.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RatingBarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RatingBarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RatingBar ratingBar;


    public RatingBarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory  method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RatingBarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RatingBarFragment newInstance(String param1, String param2) {
        RatingBarFragment fragment = new RatingBarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_rating_bar, container, false);

        ratingBar = (RatingBar) rootView.findViewById(R.id.ratingBar);
        addListenerOnButton(ratingBar);



        return rootView;
    }

    private void addListenerOnButton(RatingBar ratingBar) {
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getActivity(), "RATTING IS: " + rating, Toast.LENGTH_LONG).show();
            }
        });
    }


}
