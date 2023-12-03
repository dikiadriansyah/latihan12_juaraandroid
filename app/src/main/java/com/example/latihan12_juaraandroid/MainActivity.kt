package com.example.latihan12_juaraandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan12_juaraandroid.ui.theme.Latihan12_juaraandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan12_juaraandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}



@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
            val foto = painterResource(R.drawable.android_logo)
            Image(
                painter = foto,
                contentDescription = stringResource(R.string.descriptionimage),
                modifier = Modifier
                    .background(Color(0xff0d47a1))
                    .height(120.dp)
                    .width(150.dp)
            )
            Text(
                text = stringResource(R.string.dhiki),
                modifier = Modifier.padding(top = 14.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp

            )
            Text(
                text = stringResource(R.string.fullstack),
                modifier = Modifier.padding(top = 14.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3ddc84),
                fontSize = 25.sp
            )
        Spacer(modifier = Modifier.padding(bottom = 100.dp))
        Divider(modifier = Modifier.fillMaxWidth())
        boxRow()
    }


}

@Composable
fun boxRow(){
Row(){
    Column() {
        val iconsa = painterResource(R.drawable.baseline_local_phone_24)
        Icon(painter = iconsa, contentDescription = null, tint = Green,modifier = Modifier.padding(top = 15.dp))
        val icondua = painterResource(R.drawable.baseline_email_24)
        Icon(painter = icondua, contentDescription = null, tint = Green,modifier = Modifier.padding(top = 15.dp))
        val icontiga = painterResource(R.drawable.baseline_date_range_24)
        Icon(painter = icontiga, contentDescription = null, tint = Green,modifier = Modifier.padding(top = 15.dp))
    }
    Column() {
        Text(text = stringResource(R.string.nohp), modifier = Modifier.padding(start = 15.dp).padding(top = 15.dp))
        Text(text = stringResource(R.string.email), modifier = Modifier.padding(start = 15.dp).padding(top = 15.dp))
        Text(text = stringResource(R.string.bornYear), modifier = Modifier.padding(start = 15.dp).padding(top = 18.dp))
    }
}
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan12_juaraandroidTheme {
        Greeting()
    }
}