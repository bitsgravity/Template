package com.bits.template.data.local.database.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bits.template.data.local.database.entities.Person

@Dao
interface PersonsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPersons(persons : List<Person>)

    @Update
    fun updatePerson(person: Person)

    @Transaction
    @Query("SELECT * FROM Persons")
    fun getPersons() : LiveData<List<Person>>
}