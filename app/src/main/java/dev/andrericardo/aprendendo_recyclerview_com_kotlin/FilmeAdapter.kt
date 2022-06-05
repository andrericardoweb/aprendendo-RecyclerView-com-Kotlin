package dev.andrericardo.aprendendo_recyclerview_com_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.andrericardo.aprendendo_recyclerview_com_kotlin.models.Filme
import kotlinx.android.synthetic.main.rv_filme_item.view.*

class FilmeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Filme> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return FilmeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_filme_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is FilmeViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(filmes: List<Filme>) {
        this.items = filmes
    }

    class FilmeViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private val filmeTitulo = itemView.tv_titulo
        private val filmeAno = itemView.tv_ano
        private val filmeCapa = itemView.iv_capa

        fun  bind(filme: Filme) {
            filmeTitulo.text = filme.titulo
            filmeAno.text = filme.anoLancamento.toString()

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.no_image_placeholder)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(filme.capaImagemUrl)
                .into(filmeCapa)
        }

    }
}