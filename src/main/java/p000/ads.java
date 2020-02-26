package p000;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: ads */
/* compiled from: PG */
public final class ads implements adr {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo84a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
