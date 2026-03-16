# android

package com.example.zaripov155

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zaripov155.ui.theme.Zaripov155Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Zaripov155Theme {
                    Surface(
                        modifier  = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {}

                                            }
            }
        }
    }
@Composable
fun GreetingImage(name: String, familia: String, title: String, modifier: Modifier= Modifier) {
    val image = painterResource(R.drawable._2227a78_305d_45a6_bc3b_f49a0ea490ef__1_)

     Box{
        Image(

            painter = image,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        GreetingText(
             name = name,
             familia = familia,
            title = title,

        )
    }
    }
    @Composable
    fun GreetingText(name: String, familia: String, title: String, modifier: Modifier = Modifier) {
        Row {


            Text(
                text = name,
                fontSize = 25.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = familia,
                fontSize = 25.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center

            )


        }
        Column() {
            Text(
                text = title,
                fontSize = 25.sp,
                lineHeight = 175.sp,
                textAlign = TextAlign.Center
            )
        }
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Zaripov155Theme {
        GreetingImage("Michael", familia = "foxyman", title = "android developer")
    }
}
