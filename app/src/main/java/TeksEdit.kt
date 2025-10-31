import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable

fun FormDataDiri(modifier: Modifier
){
    //variable-variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("")}
    var textAlamat by remember { mutableStateOf("")}
    var textJK  by remember { mutableStateOf("")}

    //variable-variable untuk menyimpan data yang di peroleh dari komponen UI
    var nama by remember { mutableStateOf("")}
    var alamat by remember { mutableStateOf("")}
    var jenis by remember { mutableStateOf("")}

}