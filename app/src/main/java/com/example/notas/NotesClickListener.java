package com.example.notas;

import androidx.cardview.widget.CardView;

import com.example.notas.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
