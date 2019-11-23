import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kauzganga.myarticles.R
import com.kauzganga.myarticles.holders.ListHolder

class  ForecastListAdapter(val items : List<String>) : RecyclerView.Adapter<ListHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        var listItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list, parent, false)

        return ListHolder(listItem)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.updateNames(items[position],items[position])
    }

}
