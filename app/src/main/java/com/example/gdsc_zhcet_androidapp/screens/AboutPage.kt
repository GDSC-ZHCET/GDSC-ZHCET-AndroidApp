package com.example.gdsc_zhcet_androidapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_zhcet_androidapp.R
import com.example.gdsc_zhcet_androidapp.model.AboutData

@Composable
fun AboutPage(aboutData: AboutData) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Image(
            painter = painterResource(R.drawable.college_logo),
            contentDescription = null,
            modifier = Modifier
                .size(280.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 48.dp, bottom = 16.dp),
            contentScale = ContentScale.Fit
        )
        Card(
            backgroundColor = MaterialTheme.colors.surface,
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            elevation = 10.dp
        ) {

            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                Text(
                    text = aboutData.name,
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 32.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "About",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(text = aboutData.about, fontSize = 18.sp)
                Text(
                    text = "What We Do?",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
                for (i in aboutData.what_we_do)
                    Text(text = "• $i", fontSize = 18.sp)
                Text(
                    text = "How to Join?",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
                var count = 1
                for (i in aboutData.how_to_join) {
                    Text(text = "$count. $i", fontSize = 18.sp)
                    count++
                }
                Text(
                    text = "Partners",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Row {
                    for (i in 0..3)
                        PartnersCard(
                            partnersImage = aboutData.partnersImage[i],
                            partnersName = aboutData.partnersName[i]
                        )
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

        }
    }
}


@Composable
fun PartnersCard(partnersImage: Int, partnersName: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(height = 80.dp, width = 80.dp),
        elevation = 4.dp
    ) {
        Row {
            Image(
                painterResource(id = partnersImage), contentDescription = null, modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(8.dp)
            )
            /*
            Text(
                text = partnersName,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Clip,
                softWrap = true
            )
             */
        }
    }
}

