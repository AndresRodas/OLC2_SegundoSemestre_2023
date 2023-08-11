import axios from 'axios';

export const PostMethod = async (url, data) => {
    try {
        const response = await axios.post(`${url}`, data);
        return response.data
    } catch (error) {
        console.error('Error en la solicitud:', error);
    }
}