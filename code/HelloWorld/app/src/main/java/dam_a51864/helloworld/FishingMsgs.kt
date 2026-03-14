package dam_a51864.helloworld

import android.widget.TextView
import com.google.android.material.switchmaterial.SwitchMaterial

class FishingMsgs {

    companion object {
        fun niceDayForFishingMessageToggle(activity: MainActivity) {
            // Find the views
            val fishingSwitch = activity.findViewById<SwitchMaterial>(R.id.fishingTextSwitch)
            val firstAppMessage = activity.findViewById<TextView>(R.id.firstAppMessage)

            if (fishingSwitch != null && firstAppMessage != null){
                fishingSwitch.setOnCheckedChangeListener { _, isChecked ->
                    if (!isChecked) {
                        firstAppMessage.text = activity.getString(R.string.first)
                    } else {
                        firstAppMessage.text = activity.getString(R.string.fishing)
                    }
                }
            }
        }
    }
}