package edu.fullerton.ecs.mdap.volunteer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.fullerton.ecs.mdap.volunteer.R

/**
 * TODO: Create a RecyclerView adapter. Provide the necessary parameters, make sure it inherits from
 * the correct class and use the appropriate type parameters.
 */
class VolunteerRVAdapter(
    var parent: Context,
    var data: MutableList<String> = mutableListOf<String>()
) :
    RecyclerView.Adapter<VolunteerRVAdapter.VolunteerHolder>() {
    /**
     *  TODO: Create an inner class that will hold the view. Make sure it inherits from the correct
     *  class. Provide properties that will store references to the view elements. Connect the view
     *  elements to the properties.
     */

    class VolunteerHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.name)
    }

    /**
     * TODO: Implement the three required methods for a RecyclerView adapter. One method is
     * responsible for creating the view holder object and passing its necessary arguments, another
     * method will assign the values from the data to the view holder's view elements, adnd the
     * third returns the number of elements in the data set.
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VolunteerHolder {
        var layout = LayoutInflater.from(parent.context)
        var view = layout.inflate(R.layout.volunteer_list_item, parent, false)
        return VolunteerHolder(view)
    }

    override fun onBindViewHolder(holder: VolunteerHolder, position: Int) {
        holder.name.text = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }

}