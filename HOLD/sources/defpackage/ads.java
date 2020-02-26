package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: ads  reason: default package */
/* compiled from: PG */
public final class ads implements adr {
    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
