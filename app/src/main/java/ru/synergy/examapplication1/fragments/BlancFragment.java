package ru.synergy.examapplication1.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import ru.synergy.examapplication1.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlancFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlancFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final int YES = 0;
    private static final int NO = 1;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public BlancFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlancFragment newInstance(String param1, String param2) {
        BlancFragment fragment = new BlancFragment();
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
        final View rootView = inflater.inflate(R.layout.fragment_blanc, container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = radioGroup.findViewById(checkedId);
                int i = radioGroup.indexOfChild(radioButton);
                TextView textView = rootView.findViewById(R.id.fragmentHeader);
                switch (i) {
                    case YES:
                        textView.setText(R.string.Like);
                        break;
                    case NO:
                        textView.setText(R.string.dislake);
                        break;
                    default:
                        break; //TODO
                }
            }
        });



        return rootView;
    }
}
