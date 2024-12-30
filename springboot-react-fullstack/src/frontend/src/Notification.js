import {notification} from "antd";

const openNotificationIcon = (type, message, description, placement) => {
    placement = placement || "topRight"
    notification[type]({message, description, placement});
}

export const successNotificaiton = (type, message, description, placement) => {
    openNotificationIcon('success', message, description, placement);
}

export const errorNotification = (type, message, description, placement) => {
    openNotificationIcon('error', message, description, placement);
}

export const infoNotification = (type, message, description, placement) => {
    openNotificationIcon('info', message, description, placement);
}

export const warningNotification = (type, message, description, placement) => {
    openNotificationIcon('warning', message, description, placement);
}