package top.xkk.chat.ui.view.face;

/**
 * 表情框隐藏事件定义
 */
public class FaceEventDefine {

    private  FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;
        hideFace();
    }

    private void hideFace() {
        faceInit.root().setOnMouseExited(event -> faceInit.hide());
    }
}