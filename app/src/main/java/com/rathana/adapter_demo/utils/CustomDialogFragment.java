package com.rathana.adapter_demo.utils;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class CustomDialogFragment extends DialogFragment {

    static String title;
    public static CustomDialogFragment getInstance(String arg){
        title=arg;
        return  new CustomDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder b=new AlertDialog.Builder(getActivity());
        b.setTitle(title);
        b.setMessage("This is a dialog fragment");

        return b.create();
    }
}
