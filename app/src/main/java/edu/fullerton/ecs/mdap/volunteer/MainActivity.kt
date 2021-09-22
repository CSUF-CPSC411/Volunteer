package edu.fullerton.ecs.mdap.volunteer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.fullerton.ecs.mdap.volunteer.adapter.VolunteerRVAdapter
import edu.fullerton.ecs.mdap.volunteer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Setup data binding for activity_main.xml.
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: Create a RecyclerView adapter object and assign it to the RecyclerView.
        var volunteerAdapter = VolunteerRVAdapter(this)
        binding.volunteerList.adapter = volunteerAdapter

        // TODO: Handle onClick events on the "Add Volunteer" button.
        binding.addVolunteer.setOnClickListener {
            print(binding.volunteerName.text)
            volunteerAdapter.data.add(binding.volunteerName.text.toString())
            volunteerAdapter.notifyDataSetChanged()
        }

        // TODO: Add the volunteer to the mutableList and notify the RecyclerView about the change.
    }
}