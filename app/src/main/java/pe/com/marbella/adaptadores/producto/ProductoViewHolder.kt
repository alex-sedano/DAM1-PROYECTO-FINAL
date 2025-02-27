package pe.com.marbella.adaptadores.producto

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import pe.com.marbella.data.model.Producto
import pe.com.marbella.databinding.ListProductoBinding

class ProductoViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private var binding = ListProductoBinding.bind(view)
    fun render (producto: Producto, onItemSeleted: (codigo: Long) -> Unit){
        binding.lblNombreProd.text = producto.nombre
        binding.lbldescPro.text = producto.descripcion
        binding.lblStockAct.text = producto.stockActual.toString()
        binding.lblStockMin.text = producto.stockMinimo.toString()

        binding.lyListaProduto.setOnClickListener{onItemSeleted(producto.codigo)}

    }
}