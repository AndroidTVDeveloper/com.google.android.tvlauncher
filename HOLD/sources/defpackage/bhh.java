package defpackage;

import android.util.Pair;
import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.exoplayer2.ui.TrackSelectionView;

/* renamed from: bhh  reason: default package */
/* compiled from: PG */
public final class bhh implements View.OnClickListener {
    private final /* synthetic */ TrackSelectionView a;

    public /* synthetic */ bhh(TrackSelectionView trackSelectionView) {
        this.a = trackSelectionView;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.Object] */
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.a;
        ? r2 = 0;
        boolean z = true;
        if (view == trackSelectionView.a) {
            trackSelectionView.d = true;
            trackSelectionView.c.clear();
        } else if (view != trackSelectionView.b) {
            trackSelectionView.d = false;
            Pair pair = (Pair) view.getTag();
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            bge bge = (bge) trackSelectionView.c.get(intValue);
            bks.a((Object) r2);
            if (bge == null) {
                if (trackSelectionView.c.size() > 0) {
                    trackSelectionView.c.clear();
                }
                trackSelectionView.c.put(intValue, new bge(intValue, intValue2));
            } else if (!((CheckedTextView) view).isChecked()) {
                trackSelectionView.c.put(intValue, new bge(intValue, intValue2));
            }
        } else {
            trackSelectionView.d = false;
            trackSelectionView.c.clear();
        }
        trackSelectionView.a.setChecked(trackSelectionView.d);
        CheckedTextView checkedTextView = trackSelectionView.b;
        if (trackSelectionView.d || trackSelectionView.c.size() != 0) {
            z = false;
        }
        checkedTextView.setChecked(z);
        if (r2.length > 0) {
            bge bge2 = (bge) trackSelectionView.c.get(0);
            throw r2;
        }
    }
}
