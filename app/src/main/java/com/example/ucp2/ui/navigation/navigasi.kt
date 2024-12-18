package com.example.ucp2.ui.navigation

interface Navigasi {
    val route: String
}

object DosenHome : Navigasi {
    override val route = "home_dosen"
}

object DosenDetail : Navigasi {
    override val route = "detail_dosen"
    const val NIDN = "nidn"
    val routeWithArg = "$route/{$NIDN}"
}

object DosenUpdate : Navigasi {
    override val route = "update_dosen"
    const val NIDN = "nidn"
    val routeWithArg = "$route/{$NIDN}"
}

// Navigation for Mata Kuliah
object MataKuliahHome : Navigasi {
    override val route = "home_matakuliah"
}

object MataKuliahDetail : Navigasi {
    override val route = "detail_matakuliah"
    const val KODE = "kode"
    val routeWithArg = "$route/{$KODE}"
}

object MataKuliahUpdate : Navigasi {
    override val route = "update_mata_kuliah"
    const val KODE = "kode"
    val routeWithArg = "$route/{$KODE}"
}
