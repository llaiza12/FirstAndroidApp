 package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

 /*
 Code is written in Kotlin. Uses Jetpack Compose,
 a toolkit for building native user interfaces in Android apps
  */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // initialize the app and its UI

        enableEdgeToEdge() // function configures app to be full screen

        // Where the UI is defined, Compose allows defining UI in Kotlin code
        setContent {
            MyApplicationTheme {
                // UI element in Compose, provides basic structure for screen
                // modifier = Modifier.fillMaxSize(): makes the scaffold take up the -
                // - full screen size, innerPadding applied to content inside the scaffold to
                // avoid overlapping
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Displays greeting message and padding modifier
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable // defines a piece of UI that can be reused
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
 // Greeting(name: String): func takes name parameter and displays message
 // Text is a Jetpack Compose component used to display text

@Preview(showBackground = true) // annotation allows to preview composable func in design editor
@Composable
fun GreetingPreview() { // displays the greeting composable. useful for seeing what UI will look like
    MyApplicationTheme {
        Greeting("Android")
    }
}