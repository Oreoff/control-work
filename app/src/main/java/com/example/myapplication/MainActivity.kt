package com.example.myapplication
import androidx.compose.foundation.layout.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(android.graphics.Color.parseColor("#EDEFE3"))
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier.padding(15.dp)) {
    val backgroundColor = Color(android.graphics.Color.parseColor("#DBEA8D"))
    Column (modifier = Modifier.padding(13.dp)){
        Row(modifier = Modifier
            .padding(15.dp)
            .align(Alignment.End)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ellipse_54),
                contentDescription = "Image",
                modifier = Modifier
                    .size(51.dp)

            )
        }
        Text(
            text = "Settings",
            fontSize = 36.sp,
            modifier = modifier
        )
Row (
    modifier = Modifier.fillMaxWidth().background(backgroundColor).padding(top = 15.dp, bottom = 15.dp),
    verticalAlignment = Alignment.CenterVertically,
)
{
    Image(painter = painterResource(id = R.drawable.phonelink_setup),
        contentDescription = "Phone",
        modifier= Modifier
            .size(24.dp),
    )
    Column (modifier= Modifier.padding(start = 10.dp)){
        Text(
            text = "Get to know your Pixel",
            fontSize = 21.sp,
            modifier = Modifier
        )
        Text(
            text = "Explore what you can do with your phone",
            fontSize = 14.sp,
            modifier = Modifier
        )
    }
}
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 43.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(painter = painterResource(id = R.drawable.wifi),
                contentDescription = "Network & Internet",
                modifier= Modifier
                    .size(24.dp),
            )
            Column (modifier= Modifier.padding(start = 10.dp)){
                Text(
                    text = "Network & Internet",
                    fontSize = 21.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Wi-Fi, Mobile, Data usage, Hotspot",
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 43.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(painter = painterResource(id = R.drawable.devices_other),
                contentDescription = "Phone",
                modifier= Modifier
                    .size(24.dp),
            )
            Column (modifier= Modifier.padding(start = 10.dp)){
                Text(
                    text = "Connected devices",
                    fontSize = 21.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Bluetooth, Cast, NFC",
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 43.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(painter = painterResource(id = R.drawable.apps),
                contentDescription = "Phone",
                modifier= Modifier
                    .size(24.dp),
            )
            Column (modifier= Modifier.padding(start = 10.dp)){
                Text(
                    text = "App",
                    fontSize = 21.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Permissions, default apps",
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 43.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(painter = painterResource(id = R.drawable.notifications_none),
                contentDescription = "Phone",
                modifier= Modifier
                    .size(24.dp),
            )
            Column (modifier= Modifier.padding(start = 10.dp)){
                Text(
                    text = "Notifications",
                    fontSize = 21.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Permissions, dafault apps",
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 43.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(painter = painterResource(id = R.drawable.accessibility),
                contentDescription = "Phone",
                modifier= Modifier
                    .size(24.dp),
            )
            Column (modifier= Modifier.padding(start = 10.dp)){
                Text(
                    text = "Digital wellbeing",
                    fontSize = 21.sp,
                    modifier = Modifier
                )
                Text(
                    text = "Screen time, app timer, bedtime schedules",
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }

    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}