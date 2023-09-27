/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.jeff;

import java.util.HashMap;

/**
 *
 * @author FATEC ZONA LESTE
 */
public interface ThirdPartyYouTubeLib {
  HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);   
}
