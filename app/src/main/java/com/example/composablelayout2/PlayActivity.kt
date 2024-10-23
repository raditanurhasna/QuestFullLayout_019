package com.example.composablelayout2

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,")
        Text(text = "Rizky Ramadhan")
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Maman ALkatiri"
        )
        DetailSurat(
            judul = "Alamat",
            isinya = "Kota Bandung, Jawa Barat"
        )
        DetailSurat(
            judul = "No Telp",
            isinya = "0813245632123"
        )
        DetailSurat(
            judul = "Kepentingan",
            isinya = "DetailSurat(\n" +
            " judul = \"Nama\".\n"+
            "isisnya = \"Maman Alkatiri\"n"+
            "   )\n"+
            "DetailSurat(\n"+
            "   judul = \"Alamat\",\n" +
            "   isinya = \"Kota Bandung, Jawa Barat,\"\n" +
            " DetailSurat(\n\"+" +
                    "judul = \\\"No Telp\\\",\\n\" +\n" +
                    "                \"   isinya = \\\"0813245632123\\\"\\n\" +\n" +
                    "                \")\""



        )

    }
}


@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column{
                Text(
                    text = "Daerah Istimewa Yogyakarta",
                    color = Color.White
                )
                Text(
                    text = "FAX: 021 2121212 Telp : 082211919 ",
                    color = Color.White
                )

            }
            Box (
                contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painter = painterResource(id = R.drawable.download),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                )

            }
        }
    }
}

@Composable
fun DetailSurat(
judul:String,isinya:String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
    ){


        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }


    }

}

