package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class PlaybackTransportRowView extends LinearLayout {
    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View focusSearch(View view, int i) {
        if (view != null) {
            if (i == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt = getChildAt(indexOfChild);
                    if (childAt.hasFocusable()) {
                        return childAt;
                    }
                }
            } else if (i == 130) {
                int indexOfChild2 = indexOfChild(getFocusedChild());
                while (true) {
                    indexOfChild2++;
                    if (indexOfChild2 >= getChildCount()) {
                        break;
                    }
                    View childAt2 = getChildAt(indexOfChild2);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else if ((i == 17 || i == 66) && (getFocusedChild() instanceof ViewGroup)) {
                return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i);
            }
        }
        return super.focusSearch(view, i);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i, rect)) {
            return true;
        }
        View findViewById = findViewById(R.id.playback_progress);
        if (findViewById == null || !findViewById.isFocusable() || !findViewById.requestFocus(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }
}
