package pe.com.marbella.data.model

import com.google.gson.annotations.SerializedName
import java.time.LocalDate
import java.util.Date

data class Salida(
    @SerializedName("idSalida") var codigo: Long,
    @SerializedName("fechaSalida") var fechaSalida: String,
    @SerializedName("usuario") var usuario: Usuario,
    @SerializedName("estado") var estado: Boolean,
    @SerializedName("detalleSalida") var detalleSalida: List<DetalleSalida>
)
