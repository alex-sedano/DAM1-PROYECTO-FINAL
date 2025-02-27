package pe.com.marbella.adaptadores.usuario

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import pe.com.marbella.data.model.Usuario
import pe.com.marbella.databinding.ListUsuarioBinding

class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var binding: ListUsuarioBinding = ListUsuarioBinding.bind(view)
    fun render(usuario: Usuario, onItemSelected: (codigo: Long) -> Unit) {
        binding.lblNombreUsu.text = usuario.nombre
        binding.lblCorreoUsu.text = usuario.correo
        binding.lblUsername.text = usuario.username
        binding.lblPassUsu.text = usuario.password

        binding.lyListaUsuario.setOnClickListener{ onItemSelected(usuario.codigo)}
    }
}