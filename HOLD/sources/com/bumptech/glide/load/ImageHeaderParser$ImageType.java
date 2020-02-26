package com.bumptech.glide.load;

/* compiled from: PG */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);
    
    private final boolean a;

    public boolean hasAlpha() {
        return this.a;
    }

    private ImageHeaderParser$ImageType(boolean z) {
        this.a = z;
    }
}
