package defpackage;

import android.view.View;
import com.google.android.tvlauncher.R;

/* renamed from: dq  reason: default package */
/* compiled from: PG */
final class dq extends du {
    public dq(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
