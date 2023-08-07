package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author JuanDMH
 */
@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BucketName es el <id_del_proyecto> + ".appspot.com"#
    final String BucketName = "techshop-b25e7.appspot.com";

    //Esta es la ruta basica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-b25e7-firebase-adminsdk-njjuh-5c60de57cf.json";
}
