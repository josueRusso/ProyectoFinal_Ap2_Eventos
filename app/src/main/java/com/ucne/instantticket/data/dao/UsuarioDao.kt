package com.ucne.instantticket.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import com.ucne.instantticket.data.entity.EventoEntity
import com.ucne.instantticket.data.entity.UsuarioEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {

    @Upsert
    suspend fun upsert(usuario:UsuarioEntity)

    @Delete
    suspend fun delete(usuario: UsuarioEntity)

    @Update
    suspend fun update(usuario: UsuarioEntity)

    @Query("Select * From usuario")
    fun getUsuario(): Flow<UsuarioEntity>

    @Query("Select * From usuario Where idUsuario = :id")
    fun getUsuarioId(id: Int): Flow<UsuarioEntity>

}