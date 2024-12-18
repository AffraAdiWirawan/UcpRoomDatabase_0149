package com.example.ucp2.ui.navigasi

interface Navigation {
    val route: String
}

object DosenHome : Navigation {
    override val route = "home_dosen"
}

object DosenDetail : Navigation {
    override val route = "detail_dosen"
    const val NIDN = "nidn"
    val routeWithArg = "$route/{$NIDN}"
}

object DosenUpdate : Navigation {
    override val route = "update_dosen"
    const val NIDN = "nidn"
    val routeWithArg = "$route/{$NIDN}"
}

// Navigation for Mata Kuliah
object MataKuliahHome : Navigation {
    override val route = "home_matakuliah"
}

object MataKuliahDetail : Navigation {
    override val route = "detail_matakuliah"
    const val KODE = "kode"
    val routeWithArg = "$route/{$KODE}"
}

object MataKuliahUpdate : Navigation {
    override val route = "update_mata_kuliah"
    const val KODE = "kode"
    val routeWithArg = "$route/{$KODE}"
}