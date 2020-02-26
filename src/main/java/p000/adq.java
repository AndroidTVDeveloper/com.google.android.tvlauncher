package p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: adq */
/* compiled from: PG */
public final class adq implements adr {
    private adq() {
    }

    public /* synthetic */ adq(byte b) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo84a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
