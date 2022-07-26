package com.example.learning.data;

import android.provider.SyncStateContract;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {


    @Query("SELECT * FROM user "+ SyncStateContract.Constants.TABLE_NAME_NOTE)
    List<Note> getAll();



    @Insert
    void insert(Note note);


    @Update
    void update(Note repos);


    @Delete
    void delete(Note note);


    @Delete
    void delete(Note... note);

}

