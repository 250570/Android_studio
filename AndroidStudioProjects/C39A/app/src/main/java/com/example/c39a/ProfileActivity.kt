package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme
import java.nio.file.WatchEvent
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun ProfileBody(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text("Pro___7", style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal
            ))
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape).height(80.dp)
                    .width(80.dp),
                    contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("714")
                Text("Posts")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("1M")
                Text("Followers")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("500k")
                Text("Following")
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp)
        ) {

            Text(
                text = "Pro___7",
                fontWeight = FontWeight.Bold
            )

            Text(
                buildAnnotatedString {
                    append("I enjoy working on projects, sharing ideas, and helping others. ")
                    append("I want to make the IT Club more active, collaborative, and useful for everyone.")

                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("#hashtag")
                    }

                    append("\n")

                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("Link goes here")
                    }

                    append("\n\n")

                    append("Followed by username and username")
                },
                modifier = Modifier.padding(top = 4.dp)
            )
        }
        Row() {
            ElevatedButton(modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(9.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White,
                ),
                border = BorderStroke(
                    width = 2.dp,
                    color = Color.Black
                ),
                onClick = {}) {
                Text("Button")
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            ElevatedButton(modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                ),
                onClick = {}) {
                Text("Follow")
            }
            ElevatedButton(modifier = Modifier.weight(2f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Unspecified,
                    contentColor = Color.White
                ),
                onClick = {}) {
                Text("Message")
            }
            ElevatedButton(modifier = Modifier.weight(1f),
                onClick = {}) {
                Text("Email")
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Highlights", style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontStyle = FontStyle.Normal
                ))
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.python),
                    contentDescription = "Python",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Python")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.java),
                    contentDescription = "Java",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Java")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.ruby),
                    contentDescription = "Ruby",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Ruby")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.cprogramming),
                    contentDescription = "C++",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("C++")
            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview(){
    ProfileBody()
}
