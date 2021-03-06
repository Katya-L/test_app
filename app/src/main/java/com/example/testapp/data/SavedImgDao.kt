package com.example.testapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SavedImgDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addImg(img: Model)

    @Query("SELECT * FROM saved_img_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Model>>

}