package com.example.assignment;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AchievementDAO {

    @Query("Select * FROM Achievement")
    List<Achievement> getScores();





    @Query("Select Count(*) FROM Achievement")
    int getCount();

    @Insert
    void insertAll(List<Achievement> scores);

    @Query("DELETE FROM achievement")
    void deleteScores();

}


