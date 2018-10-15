package org.matterbot.services.giphy.model;

import lombok.Data;

@Data
public class OriginalImage {
    private String url;
    private String width;
    private String height;
    private String size;
    private String frames;
    private String mp4;
    private String mp4Size;
    private String webp;
    private String webp_size;
}