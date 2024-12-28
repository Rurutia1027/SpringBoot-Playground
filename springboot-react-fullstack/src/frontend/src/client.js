import fetch from 'unfetch';

const checkStatus = res => {
    if (res.ok) {
        return res;
    }

    // convert non-2xx HTTP responses into errors
    const error = new Error(res.statusText);
    error.response = res;
    return Promise.reject(error);
};

export const getAllStudents = () =>
    fetch('api/v1/students')
        .then(checkStatus);