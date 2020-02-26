package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: adq  reason: default package */
/* compiled from: PG */
public final class adq implements adr {
    private adq() {
    }

    public /* synthetic */ adq(byte b) {
    }

    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
