package com.arnold.simplify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class Custom {
    public static void toast(Context context, String message, int icon, int color) {
        android.widget.Toast toast = new android.widget.Toast(context);
        @SuppressLint("InflateParams") View view = LayoutInflater.from(context)
                .inflate(R.layout.toast_green, null);

        TextView tvMessage = view.findViewById(R.id.tvMessage);
        ImageView imageView = view.findViewById(R.id.image);
        CardView cardView = view.findViewById(R.id.cardView);
        cardView.setCardBackgroundColor(context.getResources().getColor(color));
        @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable = context.getResources().getDrawable(icon);

        imageView.setImageDrawable(drawable);
        tvMessage.setText(message);
        if(message.length()>35){
            imageView.setVisibility(View.GONE);
        }
        toast.setView(view);
        toast.setDuration(android.widget.Toast.LENGTH_LONG);
        toast.show();
    }
}
